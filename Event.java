public class Event {

    private String id;
    private String name;
    private String type;
    private String startDate;
    private String endDate;
    private String location;
  
    public Event (String id, String name, String type, String startDate, String endDate, String location ) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;

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
        public String getStartDate() {
        return startDate;
    }
        public String getEndDate() {
        return endDate;
    }
        public String getLocation() {
        return location;
    }

}