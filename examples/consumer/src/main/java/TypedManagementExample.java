import com.webmania.sdk.*;
import com.webmania.sdk.model.api2monitormanagement.MonitorCreateCompanyParameters;
import com.webmania.sdk.model.api2monitormanagement.MonitorCreateCompanyRequest;
import com.webmania.sdk.model.api2monitormanagement.MonitorUpdateCompanyParameters;
import com.webmania.sdk.model.api2monitormanagement.MonitorUpdateCompanyRequest;
import java.net.URI;

/** Controlled consumer example: all input uses typed constructors/setters, including both colliding names. */
public final class TypedManagementExample {
 public static void main(String[] args) {
  if(args.length!=1)throw new IllegalArgumentException("Explicit controlled origin required");
  var config=ClientConfig.builder().origin("api2/monitor-management.openapi.json",URI.create(args[0])).build();
  try(var client=new WebmaniaClient(config,Credentials.monitor(System.getenv("WEBMANIA_MONITOR_TOKEN")))) {
   var body=new MonitorCreateCompanyRequest().setCpf("00000000000").setRazaoSocial("Synthetic fixture")
       .setCep("00000000").setCertificadoBase64("Zml4dHVyZQ==").setCertificadoSenha("synthetic-password");
   var created=client.monitorCreateCompany(new MonitorCreateCompanyParameters().setBody(body));
   var updated=client.monitorUpdateCompany(new MonitorUpdateCompanyParameters().setCompany("00000000-0000-4000-8000-000000000001")
       .setBody(new MonitorUpdateCompanyRequest().setRazaoSocial("Synthetic updated")));
   System.out.println("HTTP "+created.status()+" "+updated.status());
  }
 }
}
