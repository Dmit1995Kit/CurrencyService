<#import "parts/common.ftl" as c>

<@c.page>
       <div class="containerC">
         <div class="boxC">
           <div class="contentC">
           <div id="exampleArray"></div >
                   <table class="table table-dark table-hover">
                       <thead>
                         <tr>
                           <th>DISCLAIMER</th>
                           <th>LICENSE</th>
                           <th>OFF COURSE</th>
                           <th>RUB</th>
                           <th>EUR</th>
                           <th>ANG</th>
                           <th>ARS</th>
                           <th>AUD</th>
                         </tr>
                       </thead>
                       <tbody>
                       <#list InfoCourseDB as infoCourse>
                         <tr>
                           <td>${infoCourse.disclaimer}</td>
                           <td>${infoCourse.license}</td>
                           <td>${infoCourse.base}</td>
                           <td>${infoCourse.rates.RUB}</td>
                           <td>${infoCourse.rates.EUR}</td>
                           <td>${infoCourse.rates.ANG}</td>
                           <td>${infoCourse.rates.ARS}</td>
                           <td>${infoCourse.rates.AUD}</td>
                         </tr>
                       </#list>
                       </tbody>
                     </table>
               </div>
           </div>
         </div>
       </div>
</@c.page>