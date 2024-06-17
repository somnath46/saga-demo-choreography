package com.tnt.saga.commons.event;

import java.time.Instant;
import java.util.UUID;

public interface Event {
	UUID getEventId();

    Instant getDate();
}
