package widget;

import org.junit.Test;

import objects.ChecklistItem;

import static org.junit.Assert.assertEquals;

public class ChecklistItemTest {

    @Test
    public void testGetId() {
        String name = "name";
        String done = "done";
        ChecklistItem checklistItem = new ChecklistItem(name, done);
        int id = checklistItem.getId();
        assertEquals(0, id);
    }

    @Test
    public void testGetName() {
        String name = "newname";
        String done = "yes";
        ChecklistItem checklistItem = new ChecklistItem(name, done);
        String newname = checklistItem.getName();
        assertEquals(name, newname);
    }

    @Test
    public void testGetIsDone() {
        String name = "name1";
        String done = "testing is done";
        ChecklistItem checklistItem = new ChecklistItem(name, done);
        String newdone = checklistItem.getIsDone();
        assertEquals(done, newdone);
    }

    @Test
    public void testSetId() {
        String name = "name";
        String done = "done";
        ChecklistItem checklistItem = new ChecklistItem(name, done);
        checklistItem.setId(2);
        int id = checklistItem.getId();
        assertEquals(2, id);
    }

    @Test
    public void setNewId() {
        String name = "name";
        String done = "done";
        int exp = 30;
        ChecklistItem checklistItem = new ChecklistItem(name, done);
        checklistItem.setId(exp);
        int id = checklistItem.getId();
        assertEquals(exp, id);
    }

    @Test
    public void testSetIds() {
        String name = "name";
        String done = "done";
        int exp = 189;
        ChecklistItem checklistItem = new ChecklistItem(name, done);
        checklistItem.setId(exp);
        int id = checklistItem.getId();
        assertEquals(exp, id);
    }
}