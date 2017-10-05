/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package capstoneprojectwar.pages;

import CapstoneProject.entity.Dish;
import CapstoneProject.entity.DishType;
import CapstoneProject.session.DishFacadeLocal;
import CapstoneProject.session.DishTypeFacadeLocal;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
import javax.ejb.EJB;
import javax.faces.FacesException;
import capstoneprojectwar.SessionBean1;
import capstoneprojectwar.ApplicationBean1;
import capstoneprojectwar.RequestBean1;
import com.sun.webui.jsf.model.Option;
import java.util.ArrayList;
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
 * @version NewDish.java
 * @version Created on 09 26, 17, 2:39:07 PM
 * @author Acer
 */

public class NewDish extends AbstractPageBean {
    @EJB
    private DishFacadeLocal dishFacade;
    @EJB
    private DishTypeFacadeLocal dishTypeFacade;

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    private SingleSelectOptionsList ddDishTypeDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDdDishTypeDefaultOptions() {
        return ddDishTypeDefaultOptions;
    }

    public void setDdDishTypeDefaultOptions(SingleSelectOptionsList ssol) {
        this.ddDishTypeDefaultOptions = ssol;
    }
    private DropDown ddDishType = new DropDown();

    public DropDown getDdDishType() {
        return ddDishType;
    }

    public void setDdDishType(DropDown dd) {
        this.ddDishType = dd;
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
    private TextField textField2 = new TextField();

    public TextField getTextField2() {
        return textField2;
    }

    public void setTextField2(TextField tf) {
        this.textField2 = tf;
    }
    private TextField txtID = new TextField();

    public TextField getTxtID() {
        return txtID;
    }

    public void setTxtID(TextField tf) {
        this.txtID = tf;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public NewDish() {
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
            log("NewDish Initialization Failure", e);
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
        List<Dish> dishList = this.dishFacade.findAll();
        Dish dish = dishList.get(dishList.size() - 1);
        String id = SmartCounter.generate(dish.getDishCode());
        this.txtID.setText(id);



        List<DishType> dishTypeList = this.dishTypeFacade.findAllActive();
        List<Option> optionList = new ArrayList<Option>();

        for(DishType dishType : dishTypeList){
            Option opt = new Option();
            opt.setLabel(dishType.getDishTypeName());
            opt.setValue(dishType.getDishTypeCode());
            optionList.add(opt);
        }

        Option[] optionsArr = optionList.toArray(new Option[0]);
        this.ddDishTypeDefaultOptions.setOptions(optionsArr);
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
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1) getBean("RequestBean1");
    }

    public String btnSubmit_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        String name = "";
        String desc = (String) this.textArea1.getText();
        String code = (String) this.txtID.getText();
        String disht = (String) this.ddDishType.getValue().toString();
        Date dt = new Date();

        try{
            name = (String) this.textField1.getText();
            System.out.print(disht);
            Dish dish = new Dish();
            dish.setDishCode(code);
            dish.setDishName(name);
            dish.setDishDesc(desc);
//            dish.setDishTypeCode(disht);
            dish.setCreatedAt(dt);
            dish.setUpdatedAt(dt);
            this.dishFacade.create(dish);

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

    public String btnBack_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "dishPage";
    }

    
}

