package KW.CH07;

public class Person {

    private final String givenName;
    private final String familyName;

    public Person(String givenName, String familyName) {
        this.givenName = givenName;
        this.familyName = familyName;
    }

    public String getFirstName() {
        return givenName;
    }

    public String getLastName() {
        return familyName;
    }

    /*<exercise chapter="7" section="5" type="programming" number="2">*/
    /**
     * Return true if the this Person is equal to other
     * @param other The other object
     * @return true if other is a Person and the names are the same
     */
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (this.getClass() == other.getClass()) {
            Person otherPerson = (Person) other;
            return (givenName.equals(otherPerson.getFirstName())
                    && familyName.equals(otherPerson.getLastName()));
        } else {
            return false;
        }
    }

    /**
     * Return a hash code for this object
     * @return a hash code for this object
     */
    @Override
    public int hashCode() {
        return familyName.hashCode() + 513 * givenName.hashCode();
    }
    /*</exercise>*/
}
