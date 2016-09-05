package beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 *
 * @author manito
 */
@ManagedBean
@ViewScoped
public class LoginBean {

    @ManagedProperty(value = "#{noneBean}")
    private NoneBean none;

    @Inject
    private DependBean dependBean;

    private String n;

    public void setNone(NoneBean none) {
        this.none = none;
    }

    public String setName() {
        none.setName(n);
        dependBean.setName(n);

        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("The name set for noneScoped bean is: " + none.getName()));

        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("The name set for dependScoped Bean is: " + dependBean.getName()));
        return "";
    }

    public void setN(String n) {
        this.n = n;
    }

    public NoneBean getNone() {
        return none;
    }

    public String getN() {
        return n;
    }

    public void setDependBean(DependBean dependBean) {
        this.dependBean = dependBean;
    }

}
