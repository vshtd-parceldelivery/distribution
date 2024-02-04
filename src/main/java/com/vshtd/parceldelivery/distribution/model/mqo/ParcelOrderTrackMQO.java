package com.vshtd.parceldelivery.distribution.model.mqo;

import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

@Getter
@ToString
public class ParcelOrderTrackMQO implements Serializable {

    private UUID orderUuid;
    private Set<String> recipients;
    private TrackEventType eventType;
    private Map<TrackEventParam, String> eventParam;
}
