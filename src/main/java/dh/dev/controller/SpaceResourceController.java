package dh.dev.controller;

import dh.dev.model.SpaceResource;
import dh.dev.service.SpaceResourceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpaceResourceController {

    private final SpaceResourceService spaceResourceService;

    public SpaceResourceController(SpaceResourceService spaceResourceService) {
        this.spaceResourceService = spaceResourceService;
    }

    public ResponseEntity<List<SpaceResource>> getAllSpaces() {
        return ResponseEntity.ok(spaceResourceService.getAllSpaces());
    }
}
