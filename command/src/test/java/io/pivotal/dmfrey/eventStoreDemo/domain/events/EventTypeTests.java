package io.pivotal.dmfrey.eventStoreDemo.domain.events;

import org.junit.Test;

import java.time.Instant;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

public class EventTypeTests {

    @Test
    public void testBoardInitializedEvent() {

        BoardInitialized event = new BoardInitialized( UUID.randomUUID(), Instant.now() );
        assertThat( event.eventType() ).isEqualTo( "BoardInitialized" );

    }

    @Test
    public void testBoardRenamedEvent() {

        BoardRenamed event = new BoardRenamed( "My Board", UUID.randomUUID(), Instant.now() );
        assertThat( event.eventType() ).isEqualTo( "BoardRenamed" );

    }

    @Test
    public void testStoryAddedEvent() {

        StoryAdded event = new StoryAdded( UUID.randomUUID(),"Story 1", UUID.randomUUID(), Instant.now() );
        assertThat( event.eventType() ).isEqualTo( "StoryAdded" );

    }

    @Test
    public void testStoryUpdatedEvent() {

        StoryUpdated event = new StoryUpdated( UUID.randomUUID(),"Updated Story 1", UUID.randomUUID(), Instant.now() );
        assertThat( event.eventType() ).isEqualTo( "StoryUpdated" );

    }

    @Test
    public void testStoryDeletedEvent() {

        StoryDeleted event = new StoryDeleted( UUID.randomUUID(), UUID.randomUUID(), Instant.now() );
        assertThat( event.eventType() ).isEqualTo( "StoryDeleted" );

    }

    @Test
    public void testDomainEventIgnoredEvent() {

        DomainEventIgnored event = new DomainEventIgnored( UUID.randomUUID(), Instant.now() );
        assertThat( event.eventType() ).isEqualTo( "DomainEventIgnored" );

    }

}
