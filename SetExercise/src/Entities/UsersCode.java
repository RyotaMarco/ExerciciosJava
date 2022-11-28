package Entities;

import java.util.Objects;

public class UsersCode {

    private Integer code;

    public UsersCode(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersCode usersCode = (UsersCode) o;
        return Objects.equals(code, usersCode.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
