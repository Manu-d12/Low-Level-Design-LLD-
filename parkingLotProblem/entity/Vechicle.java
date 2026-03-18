package parkingLotProblem.entity;

import parkingLotProblem.enums.VechicleType;

public class Vechicle {
    private String vechileNumber;
    private VechicleType vechicleType;

    public Vechicle(String vechileNumber, VechicleType vechicleType) {
        this.vechileNumber = vechileNumber;
        this.vechicleType = vechicleType;
    }
    public String getVechileNumber() {
        return vechileNumber;
    }
    public VechicleType getVechicleType() {
        return vechicleType;
    }
    public void setVechileNumber(String vechileNumber) {
        this.vechileNumber = vechileNumber;
    }
    public void setVechicleType(VechicleType vechicleType) {
        this.vechicleType = vechicleType;
    }    
}
