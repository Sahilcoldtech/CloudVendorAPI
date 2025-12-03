<h1>🚀 REST Demo Application</h1>
<p>
A simple Spring Boot REST API demonstrating <b>CRUD operations</b> using an in-memory data store.
This project manages <b>Cloud Vendor</b> data and is fully testable using <b>Postman</b>.
</p>

<h2>👤 Author</h2>
<p><b>Sahil Mayekar</b></p>

<h2>📑 Table of Contents</h2>
<ul>
  <li><a href="#overview">Project Overview</a></li>
  <li><a href="#techstack">Tech Stack</a></li>
  <li><a href="#structure">Folder Structure</a></li>
  <li><a href="#howitworks">How It Works</a></li>
  <li><a href="#running">Running the Application</a></li>
  <li><a href="#api">API Endpoints</a></li>
  <li><a href="#json">Sample JSON</a></li>
  <li><a href="#postman">Testing in Postman</a></li>
  <li><a href="#future">Future Improvements</a></li>
</ul>

<hr>

<h2 id="overview">📌 Project Overview</h2>
<p>
This Spring Boot project provides a clean and easy-to-understand REST API for 
performing <b>Create, Read, Update, Delete</b> operations on Cloud Vendor information.
</p>

<h2 id="techstack">🛠 Tech Stack</h2>
<ul>
  <li><b>Java 17+</b></li>
  <li><b>Spring Boot</b> (Web)</li>
  <li><b>Maven</b></li>
  <li><b>Postman</b> for testing</li>
</ul>

<h2 id="structure">📁 Folder Structure</h2>
<pre>
src/main/java/com/thinkconstructive/rest_demo/
│
├── RestDemoApplication.java        → Main Application Entry
│
├── model/
│   └── CloudVendor.java            → Vendor Model (POJO)
│
└── controller/
    └── CloudAPIService.java        → REST Controller (CRUD)
</pre>

<h2 id="howitworks">⚙️ How It Works</h2>

<h3>1️⃣ RestDemoApplication.java</h3>
<p>
Starts Spring Boot using <b>SpringApplication.run()</b>, enables auto-configuration and component scanning,
and launches the embedded Tomcat server on port <b>8080</b>.
</p>

<h3>2️⃣ CloudVendor.java</h3>
<p>
A POJO representing cloud vendor details. Used as the request/response body for JSON.
</p>

<h3>3️⃣ CloudAPIService.java</h3>
<p>
A REST Controller handling all CRUD endpoints using an in-memory <b>HashMap</b> as storage.
</p>

<hr>

<h2 id="running">▶️ Running the Application</h2>
<ol>
  <li>Open the project in IntelliJ or Eclipse</li>
  <li>Run <b>RestDemoApplication</b></li>
  <li>Server starts at:
    <pre>http://localhost:8080</pre>
  </li>
</ol>

<hr>

<h2 id="api">📡 API Endpoints</h2>

<h3><b>1. Create Vendor</b> – POST</h3>
<pre>POST /cloudvendor</pre>

<h3><b>2. Get Vendor By ID</b> – GET</h3>
<pre>GET /cloudvendor/{vendorId}</pre>

<h3><b>3. Get All Vendors</b> – GET</h3>
<pre>GET /cloudvendor</pre>

<h3><b>4. Update Vendor</b> – PUT</h3>
<pre>PUT /cloudvendor</pre>

<h3><b>5. Delete Vendor</b> – DELETE</h3>
<pre>DELETE /cloudvendor/{vendorId}</pre>

<hr>

<h2 id="json">🧪 Sample JSON</h2>
<pre>
{
  "vendorId": "v1",
  "vendorName": "Acme Cloud",
  "vendorAddress": "Mumbai",
  "vendorPhoneNumber": "9876543210"
}
</pre>

<hr>

<h2 id="postman">🧭 Testing in Postman</h2>
<ol>
  <li>Open Postman</li>
  <li>Send requests to:
    <pre>http://localhost:8080/cloudvendor</pre>
  </li>
  <li>Use <b>raw → JSON</b> body for POST & PUT</li>
</ol>

<hr>

<h2 id="future">🔮 Future Improvements</h2>
<ul>
  <li>Add a Service Layer</li>
  <li>Use a Database (H2/MySQL) with Spring Data JPA</li>
  <li>Add Validation using <b>@Valid</b> & Jakarta Validation</li>
  <li>Add Exception Handling using <b>@ControllerAdvice</b></li>
  <li>Use <b>ResponseEntity</b> with proper HTTP status codes</li>
</ul>

<hr>
<p><b>✔ This README is formatted for professional portfolios, GitHub projects, and interviews.</b></p>
