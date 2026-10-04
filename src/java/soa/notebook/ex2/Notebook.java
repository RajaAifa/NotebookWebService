/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soa.notebook.ex2;

import javax.jws.WebService;

/**
 *
 * @author rahme
 */
@WebService(serviceName = "NotebookService", portName = "NotebookPort", endpointInterface = "soa.notebook.ex1.NoteBookInterface", targetNamespace = "http://ex1.notebook.soa/", wsdlLocation = "WEB-INF/wsdl/Notebook/localhost_8080/NotebookWebService1/NotebookService.wsdl")
public class Notebook {

    public java.lang.String addPerson(java.lang.String pName, java.lang.String pAddress) {
       return "addPerson is invoked";
    }

    public java.lang.String getAddressPerson(java.lang.String pName) {
         return "getAddressPerson is invoked";
    }

    public java.lang.String getPersons() {
        return "getPersons is invoked";
       
    }

    public soa.notebook.ex1.Vector unSerializePersons() {
        return new soa.notebook.ex1.Vector();
    }
   
}
