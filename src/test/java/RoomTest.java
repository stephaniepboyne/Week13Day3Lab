import Rooms.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {
    Room room;

    @Before
    public void before(){
        room = new Room();
    }

//    @Test
//    public void testFetNumberOfExits(){
//        assertEquals(5, room.getNumberOfExits());
//    }
    
//    @Test
//    public void testGetExits(){
//        room.getExits();
//        assertEquals(2, room.getExit());
//    }

}
