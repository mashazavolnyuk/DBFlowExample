package mashazavolnyuk.dbflowexample;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.ConflictAction;
import com.raizlabs.android.dbflow.annotation.NotNull;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.annotation.Unique;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by Dark Maleficent on 08.01.2017.
 */
@Table(database = AppDatabase.class)
public class Person extends BaseModel {
    Person(){}

    @Column
    @Unique(unique = true)
    @PrimaryKey(autoincrement = true)
    long id; // package-private recommended, not required

    @Column
    @NotNull
    @Unique(unique = false,uniqueGroups = 1,onUniqueConflict = ConflictAction.REPLACE)
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
