package com.prolifics.isim.ldap;

import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.cote.accountmanager.util.XmlUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;

public class DataUtil {
	
	public static boolean createMasterAclDocument(String env, String path){
		boolean out_bool = false;
		List<String> acls = IsimAcls.importAclStrings("./cache/backup/" + env + "/acls");
		Document d = null;
		try {
			DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			d = db.newDocument();
			d.appendChild(d.createElement("AccessRight"));
			for(int i = 0; i < acls.size(); i++){
				Document ad = XmlUtil.GetDocumentFromBytes(acls.get(i).getBytes("UTF-8"));
				NodeList nl = ad.getDocumentElement().getChildNodes();
				for(int n = 0; n < nl.getLength(); n++){
					Node newNode = d.importNode(nl.item(n), true);
					d.getDocumentElement().appendChild(newNode);
				}
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			d = null;
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			d = null;
		}
		if(d != null){
			String docXml = getStringFromDoc(d);
			out_bool = SystemUtil.emitFile(docXml, path);
			
		}
		return out_bool;
	}

	public static String getStringFromDoc(Document d)    {
		/*
	    DOMImplementationLS domImplementation = (DOMImplementationLS) d.getImplementation();
	    LSSerializer lsSerializer = domImplementation.createLSSerializer();
	    return lsSerializer.writeToString(d);
	    */
		TransformerFactory tf = TransformerFactory.newInstance();
		String output = null;
		try {
			Transformer transformer = tf.newTransformer();
			transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
			StringWriter writer = new StringWriter();
			transformer.transform(new DOMSource(d), new StreamResult(writer));
			output = writer.getBuffer().toString().replaceAll("\n|\r", "");
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return output;
	}
}
