<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script src="bootstrap/js/jquery.js"></script>
<script src="bootstrap/js/bootstrap.js"></script>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <link rel="stylesheet"href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
 
<!-- Data tables Style and Script -->
<!-- adding css -->
<link rel="stylesheet"
	href="http://cdn.datatables.net/1.11.5/css/jquery.dataTables.min.css">

<!-- Adding JQuery --><script
 src="https://cdn.datatables.net/buttons/2.2.2/js/dataTables.buttons.min.js"></script>
<script
 src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js"></script>
<script
 src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/pdfmake.min.js"></script>
<script
 src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/vfs_fonts.js"></script>
<script
 src="https://cdn.datatables.net/buttons/2.2.2/js/buttons.html5.min.js"></script>
<script
 src="https://cdn.datatables.net/buttons/2.2.2/js/buttons.print.min.js"></script>
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>

<!-- Adding datatables cdn -->
<script src="http://cdn.datatables.net/1.11.5/js/jquery.dataTables.min.js"></script>

<script
 src="https://cdn.datatables.net/buttons/2.2.2/js/dataTables.buttons.min.js"></script>
<script
 src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js"></script>
<script
 src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/pdfmake.min.js"></script>
<script
 src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/vfs_fonts.js"></script>
<script
 src="https://cdn.datatables.net/buttons/2.2.2/js/buttons.html5.min.js"></script>
<script
 src="https://cdn.datatables.net/buttons/2.2.2/js/buttons.print.min.js"></script>

<!-- sweet alert -->
<script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/1.1.3/sweetalert.min.js"></script>
<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/1.1.3/sweetalert.min.css">
<script type="text/javascript">
$(document).ready(function(){
$.ajax({
url:"http://localhost:8080/getStudentData",
data:"",
type:"GET",
dataType:"json",
	success : function(response){
	var table=$('#StudentDetails').DataTable({
		data:response,
		dom:"Bfrtip",
		buttons:[{ extend: 'copy', className: 'btn-primary' },
			{ extend: 'csv', className: 'btn-primary ' },
			{ extend: 'pdf', className: 'btn-primary' },
			{ extend: 'print', className: 'btn-primary' },
			{ extend: 'excel', className: 'btn-primary' }],
		columns:[{title:"S.No",  "data":"id"},
			{title:"Name",        "data":"name"},
	        {title:"RollNo",      "data":"rollNo"},
		    {title:"EmailId",     "data":"emailId"},
			{title:"Address",     "data":"address"},
			{title:"Mobile",      "data":"mobile"},
		    {title:"DateOfBirth",         "data":"age"},
		    {title:"Gender",         "data":"gender"}, 
		    {title:"Department",  "data":"department"},
			{title : "Action", 
				"fnCreatedCell":function(data)
				{
					$(data).html("<input type='button' class='btn btn-warning'  data-toggle='modal' data-target='#exampleModal' value='edit'> <input type='button' class='btn btn-danger' value='Delete'>");
				}
						}]
	
	});
	
	
$('#StudentDetails tbody').on('click','.btn-warning',function() {

		var id       = $(this).closest('tr').find('td:eq(0)').text();
		var name       = $(this).closest('tr').find('td:eq(1)').text();
		var rollNo     = $(this).closest('tr').find('td:eq(2)').text();
		var emailId    = $(this).closest('tr').find('td:eq(3)').text();
		var address    = $(this).closest('tr').find('td:eq(4)').text();
		var mobile     = $(this).closest('tr').find('td:eq(5)').text();
		var age        = $(this).closest('tr').find('td:eq(6)').text();
		var gender     = $(this).closest('tr').find('td:eq(7)').text();
		var department = $(this).closest('tr').find('td:eq(8)').text();
		

		document.getElementById('id').value = id;
		document.getElementById('name').value = name;
		document.getElementById('rollNo').value = rollNo;
		document.getElementById('emailId').value = emailId;
		document.getElementById('address').value = address;
		document.getElementById('mobile').value = mobile;
		document.getElementById('age').value = age;
		if(gender=="male"){
            $('input[name=gender]:eq(0)').prop('checked',true);
           }else{
            $('input[name=gender]:eq(1)').prop('checked',true);
           }
		document.getElementById('department').value = department;
		
});

$('#StudentDetails tbody').on('click', '.btn-danger', function () {
	 var id = $(this).closest('tr').find('td:eq(0)').text();
	 
	 $(document).ready(function() {
		  
		   swal({
		    title: "Are you sure?",
		    text: "Do you want to Delete this Record?",
		    type: "warning",
		    showCancelButton: true,
		    confirmButtonColor: "#DD6B55",
		    confirmButtonText: "Yes",
		    cancelButtonText: "No",
		    closeOnConfirm: false,
		    closeOnCancel: false
		    },
		    function(isConfirm){
			
		    if (isConfirm) {

	 $.ajax({
	 url: "http://localhost:8080/delete",
	 data: {id:id},
	 type: "POST",
	 dataType: "text",
	 success: function(response) {
		 location.reload();
	 
	 },
	 error: function() {
	 alert("error");
	 }
	 });
		    } else {
		        swal("Cancelled");
		        }
	 });
	 });
	 });

},


error : function() {

Swal.fire({
	icon : 'error',
	title : 'Oops...',
	text : 'Something went wrong!'
	
})

}
});
});





</script>
<meta charset="UTF-8">
<title>Student List</title>
<style>

table, th, td {
	border: 1px solid black;
}
body {
background-image:url("https://png.pngtree.com/thumb_back/fh260/back_our/20190628/ourmid/pngtree-blue-university-student-s-day-background-image_279863.jpg");
	background-color:d97708;
	background-size: 100%;
}

div.a {
	text-align: center;
}

ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #9f585573;;
}
h2{
margin-top : 10px;
    background-color: #26c402;
}
li {
	float: left;
}

li a {
	display: block;
	color: white;
	text-align: center;
padding:  14px 30px;
	text-decoration: none;
	 font-size: large;

li a:hover:not(.active) {
	background-color: #111;
}

.active {
	background-color: #2e3230;
}
</style>
</head>
<body>

<ul>
	<li><a  href="/home">Home</a></li>
	<li><a href="addnew">Student Register</a>
		<li><a class="ajaxTable" href="/ajaxTable">Student List</a></li>
		<li><a href="/login" >Log-out</a></li>
	</ul>
	<h2 class="w3-text-light-grey" > AJAX DATA TABLE	</h2>
	<table id="example"></table>
</body>
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Student Details</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      	<form action="/studentUpdate" method="POST">
      <div class="modal-body">
     							
     							
      						    <label for="id" class="col-form-label">Id</label>
                                <input readonly="readonly" class="form-control" id="id"
                                   name="id" placeholder="Enter Name" required="required"/>
      							
      						    <label for="name" class="col-form-label">Name</label>
                                <input type="text" class="form-control" id="name"
                                   name="name" placeholder="Enter Name" required="required"/>
                            
                                <label for="rollNo" class="col-form-label">Roll No.</label>
                                <input type="text" class="form-control" id="rollNo"
                                    name="rollNo" placeholder="Enter Roll No." required="required" />
                            
                                <label for="email" class="col-form-label">Email</label>
                                <input type="email" class="form-control" id="emailId"
                                    name="emailId" placeholder="Email Id" required="required" />
                           
                                <label for="address" class="col-form-label">Address</label>
                                <input type="text" class="form-control" id="address"
                                    name="address" placeholder="Address" required="required"/>
                        
                                <label for="mobile" class="col-form-label">Mobile</label>
                                <input type="tel" maxlength="10" class="form-control" id="mobile"
                                    name="mobile" placeholder="mobile " pattern="^[1-9][0-9]{9}$" required="required" />
                            
                                <label for="age" class="col-form-label">dateOfBirth</label>
                                <input type="date" class="form-control" id="age"
                                   name="age" placeholder="age" required="required" />
                                   
                                
                                   <label for="gender" class="col-form-label">Gender</label><br>
                                   <input type="radio" name="gender" class="col-form-label" value="male"> Male<br>
                                   <input type="radio" name="gender" class="col-form-label" value="female"> Female<br>
                                   
                            
                            
                                 <div class="form-group">
               <label for="department">Department</label>
   
                          <select class="form-control" id="department" required="required">
              	          <option value="">Select Department</option>
         		          <option value="Computer Science">Computer Science</option>
    					  <option value="Electronics">Electronics</option>
    					  <option value="Mechanical">Mechanical</option>
    					  <option value="Civil">Civil</option>
     					  <option value="Electrical">Electrical</option>
    					  <option value="Chemical">Chemical</option>
     
            
    </select>
                            </div>
                                
                                 
                            </div>
								
                         
                      
                            
                      

                                       
              
     
   
 

      
      <div class="modal-footer">
        <button type="button"   class="btn btn-secondary" data-dismiss="modal">Close</button>
          <a href="/studentUpdate"> 
        <button type="submit" class="btn btn-primary">Save changes</button>
        
        </a> 
       
     </div>
      </form>
    </div>
  </div>
</div>
<table id="StudentDetails" >
 									
</table>

</body>

</html>