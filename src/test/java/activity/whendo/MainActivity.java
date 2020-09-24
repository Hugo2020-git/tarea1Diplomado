package activity.whendo;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class MainActivity {
    public Button addListButton;
    public Label notes;
    public Button buttonDeleteNoteList;

    public MainActivity(){
        addListButton= new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
    }

    public boolean isDisplayeNotes(String nameTileNote){
        String locator="//android.widget.TextView[@text='"+nameTileNote+"']";
        notes = new Label(By.xpath(locator));
        return notes.isDisplayed();
    }

    public void isButtonDeleteNoteOfList(String nameTitleNote){
        String locator2="//android.widget.TextView[@text='"+nameTitleNote+"']";
        buttonDeleteNoteList = new Button(By.xpath(locator2));
    }


}
