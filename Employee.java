public class Employee {

    private String id;
    private String password;
    private String name;
    private String email;
    public boolean isManager = false;

    public Employee (String id, String password, String name, String email) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.phoneNumber = email;

    }
    public Employee ( String id, String password, String name, String email, boolean manager) {
        this(id, password, name, email);
        this.isManager = manager;
    }

    /* === getters === */
    public String getId() {
        return id;
    }
    public String getPassword() {
        return password;
    }
        public String getName() {
        return name;
    }
        public String getEmail() {
        return email;
    }
}