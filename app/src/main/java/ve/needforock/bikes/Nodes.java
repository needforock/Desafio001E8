package ve.needforock.bikes;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Soporte on 04-Sep-17.
 */

public class Nodes {

    DatabaseReference root = FirebaseDatabase.getInstance().getReference();

    public DatabaseReference credential (String key){

        return root.child("credentials").child(key);
    }


}
