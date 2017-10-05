/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package capstoneprojectwar.pages;

import CapstoneProject.entity.Decor;
import CapstoneProject.session.DecorFacadeLocal;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
import javax.ejb.EJB;
import javax.faces.FacesException;
import capstoneprojectwar.SessionBean1;
import capstoneprojectwar.RequestBean1;
import capstoneprojectwar.ApplicationBean1;
import java.util.Date;
import java.util.List;
import javax.ejb.EJBException;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version NewDecor.java
 * @version Created on 10 5, 17, 6:00:02 PM
 * @author ChristelleAnne
 */

public class NewDecor extends AbstractPageBean {
    @EJB
    private DecorFacadeLocal decorFacade;
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        dropDown1DefaultOptions1.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("1", "Color Motif"), new com.sun.webui.jsf.model.Option("2", "Theme")});
        dropDown1DefaultOptions1.setSelectedValue("1");
    }
    private SingleSelectOptionsList dropDown1DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDropDown1DefaultOptions() {
        return dropDown1DefaultOptions;
    }

    public void setDropDown1DefaultOptions(SingleSelectOptionsList ssol) {
        this.dropDown1DefaultOptions = ssol;
    }
    private SingleSelectOptionsList dropDown1DefaultOptions1 = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDropDown1DefaultOptions1() {
        return dropDown1DefaultOptions1;
    }

    public void setDropDown1DefaultOptions1(SingleSelectOptionsList ssol) {
        this.dropDown1DefaultOptions1 = ssol;
    }

    // </editor-fold>

    private SingleSelectOptionsList dropwDown1 = new SingleSelectOptionsList();
    private DropDown dropDown1 = new DropDown();

    public SingleSelectOptionsList getDropwDown1() {
        return dropwDown1;
    }

    public void setDropwDown1(SingleSelectOptionsList dropwDown1) {
        this.dropwDown1 = dropwDown1;
    }

    public DropDown getDropDown1() {
        return dropDown1;
    }

    public void setDropDown1(DropDown dd) {
        this.dropDown1 = dd;
    }
    private TextField textField1 = new TextField();

    public TextField getTextField1() {
        return textField1;
    }

    public void setTextField1(TextField tf) {
        this.textField1 = tf;
    }
    private TextArea textArea1 = new TextArea();

    public TextArea getTextArea1() {
        return textArea1;
    }

    public void setTextArea1(TextArea ta) {
        this.textArea1 = ta;
    }
    private TextField txtID = new TextField();

    public TextField getTxtID() {
        return txtID;
    }

    public void setTxtID(TextField tf) {
        this.txtID = tf;
    }
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public NewDecor() {
    }

    /**
     * <p>Callback method that is called whenever a page is navigated to,
     * either directly via a URL, or indirectly via page navigation.
     * Customize this method to acquire resources that will be needed
     * for event handlers and lifecycle methods, whether or not this
     * page is performing post back processing.</p>
     * 
     * <p>Note that, if the current request is a postback, the property
     * values of the components do <strong>not</strong> represent any
     * values submitted with this request.  Instead, they represent the
     * property values that were saved for this view when it was rendered.</p>
     */
    @Override
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here
        
        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("NewDecor Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
    }

    /**
     * <p>Callback method that is called after the component tree has been
     * restored, but before any event processing takes place.  This method
     * will <strong>only</strong> be called on a postback request that
     * is processing a form submit.  Customize this method to allocate
     * resources that will be required in your event handlers.</p>
     */
    @Override
    public void preprocess() {
    }

    /**
     * <p>Callback method that is called just before rendering takes place.
     * This method will <strong>only</strong> be called for the page that
     * will actually be rendered (and not, for example, on a page that
     * handled a postback and then navigated to a different page).  Customize
     * this method to allocate resources that will be required for rendering
     * this page.</p>
     */
    @Override
    public void prerender() {
        List<Decor> decorList = this.decorFacade.findAll();
        Decor decor = decorList.get(decorList.size() - 1);
        String id = SmartCounter.generate(decor.getDecorCode());
        this.txtID.setText(id);
    }

    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called (regardless of whether
     * or not this was the page that was actually rendered).  Customize this
     * method to release resources acquired in the <code>init()</code>,
     * <code>preprocess()</code>, or <code>prerender()</code> methods (or
     * acquired during execution of an event handler).</p>
     */
    @Override
    public void destroy() {
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1) getBean("RequestBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

    public String btnSubmit_action() {
        // TODO: Replace with your code
        String name = "";
        String desc = (String) this.textArea1.getText();
        String code = (String) this.txtID.getText();
        String type = (String) dropDown1.getValue().toString();
        Date dt = new Date();

        try{
            name = (String) this.textField1.getText();

            Decor decor = new Decor();
            decor.setDecorCode(code);
//            decor.setDecorType(type);
            decor.setDecorName(name);
            decor.setDecorDesc(desc);
            decor.setCreatedAt(dt);
            decor.setUpdatedAt(dt);
            this.decorFacade.create(decor);

            this.info("Created successfully.");
            this.textField1.setText("");
            this.textArea1.setText("");
        }catch (NullPointerException e){
            this.info("Fields with * are mandatory.");
        }catch (EJBException ex){
            this.info("Name already exists; or");
            this.info("Please try again.");
        }
        return null;
    }

    
}

