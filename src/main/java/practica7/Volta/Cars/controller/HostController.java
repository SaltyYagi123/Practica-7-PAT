package practica7.Volta.Cars.controller;

import practica7.Volta.Cars.model.HostDTO;
import practica7.Volta.Cars.service.hostService;

@RestController
@RequestMapping("/api/v1")
public class HostController{
    @Autowired
    private HostService hostService;

    @GetMapping("/host")
    public ResponseEntity<List<HostDTO>> getHosts(@RequestParam(required = false)) {
        List<HostsDTO> response = hostService.getHosts();
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/host/charger")
    public ResponseEntity<List<HostChargerDTO>> getHostsWithCharger(@RequestParam(required = false)) {
        List<HostChargerDTO> response = hostService.getHostsWithCharger();
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/host/charger/all")
    public ResponseEntity<List<HostChargerDTO>> getAllHosts(@RequestParam(required = false)) {
        List<HostChargerDTO> response = hostService.getAllHosts();
        return ResponseEntity.ok().body(response);
    }
    

}