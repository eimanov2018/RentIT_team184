package enterprise.domain;
import org.springframework.roo.addon.dbre.RooDbManaged;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(identifierType = PlantHireRequestPlantPK.class, versionField = "", table = "plant_hire_request_plant", schema = "public")
@RooDbManaged(automaticallyDelete = true)
public class PlantHireRequestPlant {
}
