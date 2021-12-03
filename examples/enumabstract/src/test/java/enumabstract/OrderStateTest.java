package enumabstract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OrderStateTest {

    @Test
    void testCanDeleteOnNew() {
        OrderState state = OrderState.NEW;

        assertTrue(state.canDelete());
    }

    @Test
    void testCanDeleteOnConfirmed() {
        OrderState state = OrderState.CONFIRMED;

        assertTrue(state.canDelete());
    }

    @Test
    void testCanDeleteOnPrepared() {
        OrderState state = OrderState.PREPARED;

        assertTrue(state.canDelete());
    }

    @Test
    void testCanDeleteOnOnboard() {
        OrderState state = OrderState.ONBOARD;

        assertFalse(state.canDelete());
    }

    @Test
    void testCanDeleteOnDelivered() {
        OrderState state = OrderState.DELIVERED;

        assertFalse(state.canDelete());
    }

    @Test
    void testCanDeleteOnReturned() {
        OrderState state = OrderState.RETURNED;

        assertFalse(state.canDelete());
    }

    @Test
    void testCanDeleteOnDeleted() {
        OrderState state = OrderState.DELETED;

        assertFalse(state.canDelete());
    }
}
