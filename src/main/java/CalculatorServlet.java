import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.swing.event.InternalFrameEvent;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet", urlPatterns = "")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }






    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*String principalAmount = request.getParameter("principalAmount");
        String interest = request.getParameter("interest");
        String years = request.getParameter("years");
        String compoundingPeriod = request.getParameter("compoundingPeriod");
        String error;


        if (principalAmount == null || interest == null || years == null || compoundingPeriod == null||principalAmount.isBlank()||interest.isBlank()||years.isBlank()||compoundingPeriod.isBlank()) {
            error = "One or more input boxes are blank. Try again";
            request.setAttribute("error", error);
        } else {
            double result = Utils.calculateCompoundInterest(
                    Double.parseDouble(principalAmount),
                    Double.parseDouble(interest)/100,
                    Integer.parseInt(years),
                    Integer.parseInt(compoundingPeriod));

            System.out.println(result);
            request.setAttribute("principal",principalAmount);
            request.setAttribute("interest",interest);
            request.setAttribute("years",years);
            request.setAttribute("compoundingPeriod",compoundingPeriod);
            request.setAttribute("Result:", result);
            System.out.println(result);
        }
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);*/



        //Parameters sent in the post request
        String principleAmount = request.getParameter("principalamount");
        String interestPercentage = request.getParameter("interest");
        String years = request.getParameter("years");
        String compoundingPeriod = request.getParameter("compoundingperiod");

        String error;

        //Validate the input
        //If any of the parameters sent in the post request are empty or don't exist, show the error message
        if (principleAmount == null || principleAmount.isBlank() || interestPercentage == null || interestPercentage.isBlank() ||
                years == null || years.isBlank() || compoundingPeriod == null || compoundingPeriod.isBlank()){

            //Error to show to the user so they can correct their mistakes
            error = "One or more of the input boxes were blank. Try again.";

            request.setAttribute("error", error);
        }else{

            //since the parameters were gotten, do the interest calculation
            double result = Utils.calculateCompoundInterest(Double.parseDouble(principleAmount), (Double.parseDouble(interestPercentage) / 100),
                    Integer.parseInt(years), Integer.parseInt(compoundingPeriod));

            //Send the result as an attribute to be displayed in the JSP
            request.setAttribute("principle", principleAmount);
            request.setAttribute("interest", interestPercentage);
            request.setAttribute("years", years);
            request.setAttribute("compoundingPeriod", compoundingPeriod);
            request.setAttribute("result", result);
        }

        //Forward this to a JSP page
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);

    }
}
