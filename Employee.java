public class Employee {
private String id;
private String name;
private String password;
private String email;

     public Employee() {

     }
     public Employee (String Id, String name, String password, String email) {
           this.id = Id;
           this.name = name;
           this.password = password;
           this.email = email;
    }

    public void setId(String id) {
         this.id = id; 
    }

    public String getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
      }

    public String getName() {
        return this.name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setEmail(String email) {
         this.email = email;
     }

    public String getEmail() {
      return this.email;
     }
    public String toString() {
      return this.id + " " + this.name + " " + this.password + " " + this.email;
    }
     }
