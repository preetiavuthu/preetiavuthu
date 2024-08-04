package API;

import come.meghanajava.meghanajava.model.customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/customers")
public class customeResource {

    @Autowired
    private customerService customerService;

    public Customer addCustomer(@RequestBody customer customer) {
        return customerService.addcustomer(customer);
    }

