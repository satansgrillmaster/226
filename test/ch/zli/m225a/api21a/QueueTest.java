package ch.zli.m225a.api21a;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    private QueueList<String> queueList;
    @BeforeEach
    void initQueue(){
        this.queueList = new QueueList<>(5);
    }

    @Nested
    class a_new_queue {
        @Test
        private void is_Empty(){
            assertEquals( 0, queueList.getListSize());
        }
    }
}
