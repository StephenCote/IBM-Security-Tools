package com.prolifics.shell;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.prolifics.ldap.util.LDAPUtil;
import com.prolifics.shell.commands.ADAccountCommands;
import com.prolifics.shell.commands.SIMPersonCommands;

public class ValidatorShell {

	public Properties sdsEnv = null;
	public String sdsSearchBase = null;
	public static final Logger logger = Logger.getLogger(ValidatorShell.class.getName());
	
	public static void main(String[] args) {
		
		Properties props = new Properties();
		try {
			InputStream fis = new FileInputStream("./resource.properties");
			//ClassLoader.getSystemResourceAsStream("resource.properties");//ValidatorShell.class.getResourceAsStream("/resource.properties");
			props.load(fis);
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PropertyConfigurator.configure(getLogProps());
		
		logger.info("Prolifics SIM Attribute Validator");
		
		Options options = new Options();
		
		options.addOption("attributes",true,"List of account attributes");
		options.addOption("viewPersons",true,"List of persons to view");
		options.addOption("viewSimAdAccounts", true, "List of AD Account Names");
		options.addOption("viewAdAccounts",true,"List of AD Account Names");
		
		options.addOption("adEnv",true,"AD Environment");
		
		CommandLineParser parser = new PosixParser();
		CommandLine cmd = null;
		try {
			cmd = parser.parse( options, args);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		processCommandLine(cmd, props);
		
	}
	
	private static void processCommandLine(CommandLine cmd, Properties props){
		String sdsSearchBase = props.getProperty("sds.searchBase");
		String userName = props.getProperty("sds.bindUser");
		String server = props.getProperty("sds.server");
		String password = props.getProperty("sds.bindPassword");

		String adEnv = "corp";
		if(cmd.hasOption("adEnv")) adEnv = cmd.getOptionValue("adEnv");
		
		String adSearchBase = props.getProperty("ad." + adEnv + ".searchBase");
		String adUserName = props.getProperty("ad." + adEnv + ".bindUser");
		String adServer = props.getProperty("ad." + adEnv + ".server");
		String adPassword = props.getProperty("ad." + adEnv + ".bindPassword");

		Properties sdsProps = null;
		if(server != null && userName != null && password != null){
			sdsProps = LDAPUtil.getBindProperties(server, userName, password);
		}
		Properties adProps = null;
		if(adEnv != null && adServer != null && adUserName != null && adPassword != null){
			adProps = LDAPUtil.getBindProperties(adServer, adUserName, adPassword);
			adProps.put("Context.REFERRAL", "follow");
		}
		
		

		if(sdsProps != null && cmd.hasOption("viewPersons")){
			logger.info("PERSON PERSON PERSON");
			if(cmd.hasOption("attributes")){
				SIMPersonCommands.checkPersonAttributes(sdsProps, sdsSearchBase, cmd.getOptionValues("viewPersons"), cmd.getOptionValues("attributes"));	
			}
			else{
				SIMPersonCommands.viewPersons(sdsProps, sdsSearchBase, cmd.getOptionValues("viewPersons"));
			}
		}
		if(sdsProps != null && cmd.hasOption("viewSimAdAccounts")){
			logger.info("SIM AD ACCOUNT SIM AD ACCOUNT SIM AD ACCOUNT");

			if(cmd.hasOption("attributes")){
				ADAccountCommands.checkSimADAccountAttributes(sdsProps, sdsSearchBase, cmd.getOptionValues("viewSimAdAccounts"), cmd.getOptionValues("attributes"));	
			}
			else{
				ADAccountCommands.viewSimADAccounts(sdsProps, sdsSearchBase, cmd.getOptionValues("viewSimAdAccounts"));
			}
		}
		if(adProps != null && cmd.hasOption("viewAdAccounts")){
			logger.info("AD ACCOUNT AD ACCOUNT AD ACCOUNT");
			logger.info("AD ENVIRONMENT: " + adEnv);
			if(cmd.hasOption("attributes")){
				ADAccountCommands.checkADAccountAttributes(adProps, adSearchBase, cmd.getOptionValues("viewAdAccounts"), cmd.getOptionValues("attributes"));	
			}
			else{
				ADAccountCommands.viewADAccounts(adProps, adSearchBase, cmd.getOptionValues("viewAdAccounts"));
			}
		}

	}
	
	private static void emitFile(String path, String contents){
		File f = new File(path);

		
		try {
			if(f.exists()) f.delete();
			f.createNewFile();
			BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(f));
			writer.write(contents.getBytes("UTF-8"));
			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static Properties getLogProps(){
		Properties logProps = new Properties();
		try {
			logProps.load(new FileInputStream("./logging.properties")); // ClassLoader.getSystemResourceAsStream("logging.properties")
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return logProps;
	}

}
