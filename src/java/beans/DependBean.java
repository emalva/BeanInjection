package beans;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author manito
 */
@Named(value = "dependBean")
@Dependent
public class DependBean {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
