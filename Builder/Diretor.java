package Builder;

import java.util.HashMap;
import java.util.Map;

public class Diretor {

    private Map<String, VirtualMachine> preDefinedVms = new HashMap<>();

    public VirtualMachine getMlVm() {
        VirtualMachine vm = new VirtualMachine.Builder()
                .setOperatingSystem("Linux")
                .setRam(16)
                .setStorage(512)
                .setGpu("NVIDIA RTX 3090")
                .setCpu("Intel i9")
                .setSSD(true)
                .build();
        return vm;
    }

    public VirtualMachine getDevVm() {
        VirtualMachine vm = new VirtualMachine.Builder()
                .setOperatingSystem("Linux")
                .setRam(8)
                .setStorage(512)
                .setGpu("None")
                .setCpu("Intel i9")
                .setSSD(false)
                .build();
        return vm;
    }

}