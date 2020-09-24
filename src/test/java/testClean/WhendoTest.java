package testClean;

import activity.whendo.AddNoteToList;
import activity.whendo.DeleteNote;
import activity.whendo.MainActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;


import java.net.MalformedURLException;

public class WhendoTest {
    MainActivity whendoActivity = new MainActivity();
    AddNoteToList addNoteToList = new AddNoteToList();
    DeleteNote deleteNoteOfList = new DeleteNote();

    @Test
    public void verifyAddNumber() throws MalformedURLException {

        // adicionamos la nota uno
        String note = "uno";
        String description="descripcion "+note;
        whendoActivity.addListButton.click();
        addNoteToList.titleNote.type(note);
        addNoteToList.descriptionNote.type(description);
        addNoteToList.saveButton.click();
        Assert.assertTrue("ERROR! al insertar la nota",whendoActivity.isDisplayeNotes(note));

       // adicionamos la nota dos
         note = "dos";
         description="descripcion "+note;
        whendoActivity.addListButton.click();
        addNoteToList.titleNote.type(note);
        addNoteToList.descriptionNote.type(description);
        addNoteToList.saveButton.click();
        Assert.assertTrue("ERROR! en la insercion",whendoActivity.isDisplayeNotes(note));

        // eliminamos la nota dos
        note = "dos";
        if(whendoActivity.isDisplayeNotes(note)){
            whendoActivity.isButtonDeleteNoteOfList(note);
            whendoActivity.buttonDeleteNoteList.click();
            deleteNoteOfList.deleteButton.click();
            deleteNoteOfList.confirmDeleteButton.click();
            Assert.assertTrue("ERROR! en la eliminacion",!whendoActivity.isDisplayeNotes(note));
        }

    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
