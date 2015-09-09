package models;

import com.avaje.ebean.Model.Finder;
import play.data.validation.Constraints;
import javax.persistence.*;
import java.lang.String;
/**
 * Created by dinko.hodzic on 08/09/15.
 */
@Entity
public class UserType {
    @Id
    public Integer id;

    @Constraints.MaxLength(255)
    public String name;

    private static Finder<String, UserType> finder = new Finder<>(UserType.class);

    public static UserType getUserTypeById(Integer id) {
        UserType ut = UserType.finder.where().eq("id", id).findUnique();
        return ut;
    }
}
