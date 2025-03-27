package lang.obj.equals;

import java.util.Objects;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    //IDE가 자동생성한 equals
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }


    //    @Override
//    public boolean equals(Object obj) {
//        UserV2 u = (UserV2) obj;
//        return id.equals(u.id);
//
//    }
}
