package by.belstu.it.krishtal.basejava;

import java.util.Objects;

/**
 * @author Maks
 * @version 12
 */
public class WrapperString {
    public WrapperString() {

    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "WrapperString{" +
                "string='" + string + '\'' +
                '}';
    }

    private String string;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WrapperString that = (WrapperString) o;
        return Objects.equals(string, that.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(string);
    }
    public void replace (char oldchar, char newchar)
    {
        string = string.replace(oldchar, newchar);
    }
}
