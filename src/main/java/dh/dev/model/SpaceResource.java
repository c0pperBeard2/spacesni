package dh.dev.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpaceResource {
    private Integer id;
    private String spaceName;
    private SpaceTypeResource spaceType;
    private String spaceDescription;
    private Boolean hasWifi;
    private String wifiPassword;
}
