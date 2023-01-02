
class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName.trim();
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName.trim();
        }
    }

    public String getFullName() {
        return this.firstName.isEmpty() && this.lastName.isEmpty() ? "Unknown" :
                this.firstName.trim().concat(" ").concat(this.lastName.trim());
    }
}