# NotebookWebService

A Java SOAP web service built with JAX-WS and deployed on GlassFish. It implements a simple address-book (notebook) service to manage persons and their addresses.

## Overview

This project demonstrates SOAP-based web service development with Java EE (JAX-WS), using an interface-first (contract-first) design. It exposes one web service:

- **NotebookService** — implements the `NoteBookInterface` contract and manages a collection of persons (name/address pairs), with operations to add, look up, and list persons.

## Technologies Used

- **Language:** Java 1.8
- **Web Services:** JAX-WS (`javax.jws` — `@WebService`, `@WebMethod`, `@WebParam`, `@WebResult`), RPC-style SOAP binding
- **Application Server:** GlassFish (Java EE 7 Web Profile)
- **Build Tool:** Apache Ant (NetBeans project)
- **IDE:** NetBeans

## Prerequisites

- JDK 8
- GlassFish Server (4.x or compatible with Java EE 7 Web Profile)
- NetBeans IDE (recommended, includes Ant build integration) or Apache Ant

## Run Locally

Clone the project:

    git clone https://github.com/<your-username>/NotebookWebService.git

Go to the project directory:

    cd NotebookWebService

Open the folder in NetBeans (**File > Open Project**), or build it directly with Ant:

    ant build

### Deploy to GlassFish

Deploy the generated WAR file (`dist/NotebookWebService2.war`) to your GlassFish domain, or run the project from NetBeans, which starts GlassFish and deploys the app automatically.

### Access the service

Once deployed, the WSDL is available at:

    http://localhost:8080/NotebookWebService2/NotebookService?wsdl

## How to Use

**NotebookService**

- `addPerson(String pName, String pAddress)` — registers a new person with a name and address.
- `getAddressPerson(String pName)` — retrieves a person's address by name.
- `getPersons()` — returns the list of registered persons.
- `unSerializePersons()` — returns the persons collection as a `Vector` object.

You can test the service with the GlassFish auto-generated tester page:

    http://localhost:8080/NotebookWebService2/NotebookService?Tester

## Project Structure

    NotebookWebService2/
    ├── src/java/soa/notebook/ex2/
    │   └── Notebook.java            # SOAP web service implementation (NoteBookInterface)
    ├── src/conf/xml-resources/web-services/Notebook/wsdl/
    │   └── NotebookService.wsdl     # Service contract (WSDL)
    ├── web/
    │   ├── index.html               # Landing page
    │   └── WEB-INF/web.xml          # Deployment descriptor
    ├── nbproject/                   # NetBeans project configuration
    ├── build.xml                    # Ant build script
    └── dist/NotebookWebService2.war # Deployable WAR archive
