//MVC DESIGN PATTERN USING SERVLET AND JSP :
//ARCHITECTURE : 
//What's the problem with JSP ? 
//→ When we run JSP for the first time , it get's converted into servlet which takes time . 
//→ We can't/should never write our business logic inside JSP because it's only for the view . That means all the information processing stuff should take place inside the servlet itself . 
//→ Through html , we can only create static pages , but with JSP we can go for dynamic pages.
//
//ARCHITCTURE FLOW : 
//→ Layout ( Design ) → Will be done through JSP → It will be just a layout without data.
//→ Client will send a request for a data let's say - /getpage  → request goes to →  CONTROLLER
//→ Now this CONTROLLER (created with the help of servlets) holds the data in the format of MODEL OBJECT (POJO-Plain old java object)and it's job is to send the this model object to the layout/view/JSP and  call it  .
//→CONTROLLER only only for accepting request and sending response , so we dont perform actual processing inside controller . 
//→To perform data processing , this CONTROLLER will another class called Service Class.
//→Inside this Service Class , we can write JDBC steps to connect it to DB via DAO Layer/classes.

//PROCESS FLOW : 
//Client → Request → CONTROLLER → calls → SERVICE-CLASS (saying "Hey Service class , give me the MODEL object with data so that I can send it to the VIEW LAYER" → SERVICE CLASS (for data processing) → connect with → JDBC WITH RDBMS → DAO LAYER/CLASSES → after getting the data in the format of MODEL OBJECT aka (POJO-Plain old java object)) → CONTROLLER →sends →MODEL OBJECT →VIEW LAYER/DESIGN LAYER → sent to →CLIENT
