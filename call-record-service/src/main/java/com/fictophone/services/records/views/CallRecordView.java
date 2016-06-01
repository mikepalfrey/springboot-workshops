package com.fictophone.services.records.views;

import java.util.Optional;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CallRecordView {

	@JsonProperty
	private final UUID id;

	@JsonProperty
	private final UUID ownerId;

	@JsonProperty
	private final LegView inbound;

	@JsonProperty
	private final Optional<LegView> outbound;

	@JsonCreator
	public CallRecordView(@JsonProperty("id") final UUID pId, 
			@JsonProperty("ownerId") final UUID pOwnerId, 
			@JsonProperty("inbound") final LegView inbound, 
			@JsonProperty("outbound") final Optional<LegView> outbound) {
		this.id = pId;
		this.ownerId = pOwnerId;
		this.inbound = inbound;
		this.outbound = outbound;
	}

	public UUID getId() {
		return id;
	}
	public UUID getOwnerId() {
		return ownerId;
	}
	public LegView getInbound() {
		return inbound;
	}
	public Optional<LegView> getOutbound() {
		return outbound;
	}

}
