package come.meghanajava.meghanajava.model;

import API.string;

public class customer {

 public int getCustomerIdcount() {
  return customerIdcount;
 }

 public void setCustomerIdcount(int customerIdcount) {
  this.customerIdcount = customerIdcount;
 }

 private  int customerIdcount = 1;
 private string customerFirstName;
 private  string customerLastName;
 private  string CustomerEmail;

 public string getCustomerEmail() {
  return CustomerEmail;
 }

 public void setCustomerEmail(string customerEmail) {
  CustomerEmail = customerEmail;
 }

 public string getCustomerFirstName() {
  return customerFirstName;
 }

 public void setCustomerFirstName(string customerFirstName) {
  this.customerFirstName = customerFirstName;
 }

 public string getCustomerLastName() {
  return customerLastName;
 }

 public void setCustomerLastName(string customerLastName) {
  this.customerLastName = customerLastName;
 }

 public int getCustomerId() {
  return customerId;
 }

    public void setCustomerId() {
        setCustomerId();
    }

    public void setCustomerId(int customerId) {
  this.customerId = customerId;
 }
}
