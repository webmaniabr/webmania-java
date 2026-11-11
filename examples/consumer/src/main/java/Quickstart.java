import com.webmania.sdk.*;
import com.webmania.sdk.model.api2monitorreads.MonitorListCompaniesRequest;
import java.math.BigInteger;
import java.net.URI;

/** Server-side Monitor example. The local test origin is explicitly supplied only by the controlled consumer test. */
public final class Quickstart {
 public static void main(String[] args) {
  String token=System.getenv("WEBMANIA_MONITOR_TOKEN");
  if(token==null || token.isBlank())throw new IllegalArgumentException("Set WEBMANIA_MONITOR_TOKEN");
  var config=ClientConfig.builder();
  if(args.length==1)config.origin("api2/monitor-reads.openapi.json",URI.create(args[0]));
  try(var client=new WebmaniaClient(config.build(),Credentials.monitor(token))) {
   var request=new MonitorListCompaniesRequest().setPage(BigInteger.ONE).setPerPage(BigInteger.TEN);
   var result=client.monitorListCompanies(request);
   System.out.println("HTTP "+result.status());
  }catch(ApiException error){System.err.println(error.getMessage());System.exit(2);}
 }
}
