package activity.whendo;

import appiumControl.Button;
import org.openqa.selenium.By;

public class DeleteNote {
    public Button deleteButton;
    public Button confirmDeleteButton;

    public DeleteNote(){
        deleteButton = new Button(By.id("com.vrproductiveapps.whendo:id/deleteItem"));
        confirmDeleteButton = new Button(By.id("android:id/button1"));
    }

}
