package Builder;

// Classe VirtualMachine (Produto a ser construído) 
public class VirtualMachine {
    private String operatingSystem;
    private int ram;
    private int storage;
    private String gpu;
    private String cpu;
    private boolean isSSD;

    // Construtor privado para forçar a construção via Builder
    // Vai receber um objeto "construido"
    private VirtualMachine(Builder builder) {
        this.operatingSystem = builder.operatingSystem;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.cpu = builder.cpu;
        this.isSSD = builder.isSSD;
    }

    @Override
    public String toString() {
        return "VirtualMachine{" +
                "Operating System='" + operatingSystem + '\'' +
                ", RAM=" + ram + " GB" +
                ", Storage=" + storage + " GB" +
                ", GPU='" + gpu + '\'' + 
                ", CPU='" + cpu + '\'' + 
                ", SSD=" + (isSSD ? "Yes" : "No") + '}';
    }

    // Builder estático para construir a VirtualMachine
    // Estático para não precisar instanciar
    public static class Builder {
        private String operatingSystem;
        private int ram;
        private int storage;
        private String gpu;
        private String cpu;
        private boolean isSSD;

        // Método para definir o sistema operacional
        public Builder setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            // Retorna ele mesmo para poder fazer uma chamada encadeada
            return this;
        }

        // Método para definir a quantidade de RAM
        public Builder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        // Método para definir o armazenamento
        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        // Método para definir a GPU
        public Builder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        // Método para definir a CPU
        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        // Método para definir se a máquina usa SSD
        public Builder setSSD(boolean isSSD) {
            this.isSSD = isSSD;
            return this;
        }

        // Método para construir a VirtualMachine
        public VirtualMachine build() {
            return new VirtualMachine(this);
        }
    }
}