public class Event {

    private String id;
    private String name;
    private String type;
    private String date;
    private String location;
    private Double eventPrice;
    
         public Event() {

     }
  
    public Event (String id, String name, String type, String date, String location, double eventPrice ) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.date = date;
        this.location = location;
        this.eventPrice = eventPrice;
    }
    /* === setters ===  */
  public void setId(String id) {
    this.id = id;
  }
    public void setName(String name) {
    this.name = name;
  }
    public void setType(String type) {
    this.type = type;
  }
    public void setDate(String date) {
    this.date = date;
  }
    public void setLocation(String location) {
    this.location = location;
  }
    public void setEventPrice(double eventPrice) {
    this.eventPrice = eventPrice;
  }


    /* === getters === */
       public String getId() {
        return id;
    }

        public String getName() {
        return name;
    }
        public String getType() {
        return type;
    }
        public String getDate() {
        return date;
    }
        public String getLocation() {
        return location;
    }
        public double getEventPrice() {
        return eventPrice;
    }
   
}
