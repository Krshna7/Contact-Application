

var app = angular.module('myApp', []);
app.controller('appCtrl',function($scope, $http) {
	
	$scope.validateatstart=true;
	
	$scope.validateFirstName=function(){
		$scope.validateatstart=false;
		
	}
	$scope.id = null;
	$scope.edit = function(id,firstname,lastname,address,email,phonenumber){
		
        $scope.id=id;
        $scope.firstname=firstname;
        $scope.lastname=lastname;
        $scope.address=address;
        $scope.email=email;
        $scope.phonenumber=phonenumber;
        
      //  $scope.phonenumber=document.getElementById('phonenumber').value;
    }
	
	
	
       
       $scope.InActivateContact = function(idSel) {
    	   var retVal = confirm("Do you Sure want to InActivate");
           if (retVal == true) {
$http.get("/Contact/ws/updateInformationStatus?idSel=" + idSel)
//window.location = "index.html";
alert('Contact InActivated');
$scope.InActivelistUser();
return true;
           } else {
               return false;
    	       	  }
       }
    
       $scope.ActivateContact = function(idSel) {
    	   var retVal = confirm("Do you Sure want to Activate");
           if (retVal == true) {
    	   $http.get("/Contact/ws/updateStatus?idSel=" + idSel)
    	   //window.location = "index.html";
    	   alert('Contact Activated');
    	   $scope.ActivelistUser();
    	   return true;
           } else {
               return false;
    	       	  }
       }
       
       
       $scope.deleteContact = function(idSel) {
    	   var retVal = confirm("Do you Sure want to delete");
           if (retVal == true) {
        	   $http.get("/Contact/ws/DeleteInformation?idSel=" + idSel)
        	   //window.location = "index.html";
        	   alert('Contact Deleted');
        	   $scope.listUser();
        	   
               return true;
           } else {
               return false;
           }

    	   
    	       	  }
       
       
        
        
        $scope.listUser = function() {
        	
        	$http.get("/Contact/ws/getInformationDetails")
            .success(function (response) {		
            $scope.names = response.data;
            //self.users = response.data;
          
           
           
            });
        }
 $scope.ActivelistUser = function() {
        	
        	$http.get("/Contact/ws/getActiveInformationDetails")
            .success(function (response) {		
            $scope.names = response.data;
            //self.users = response.data;
          
           
           
            });
        }
 $scope.InActivelistUser = function() {
 	
 	$http.get("/Contact/ws/getInActiveInformationDetails")
     .success(function (response) {		
     $scope.names = response.data;
     //self.users = response.data;
   
    
    
     });
 }
 
        
        
        $scope.reset=function(){
        	$scope.id =null;
            $scope.firstname='';
            $scope.lastname='';
            $scope.address='';
            $scope.email='';
            $scope.phonenumber='';
        	
        }
        $scope.submitNew = function() {
        	$scope.validateatstart=true;
            if($scope.id === null){
            	//alert('Create');
            	$http.get("/Contact/ws/createInformation?firstname="+$scope.firstname+"&lastname="+$scope.lastname+"&email="+$scope.email+"&phonenumber="+$scope.phonenumber)
            	.success(
							function(response) {
								$scope.regnores = response.data;
								alert($scope.regnores);
					          	 //window.location = "index.html";
								$scope.listUser();
								
							});
      		  
            	
            }else{
            	//alert('Update');
            	$http.get("/Contact/ws/updateInformation?idSel="+$scope.id+"&firstname="+$scope.firstname+"&lastname="+$scope.lastname+"&email="+$scope.email+"&phonenumber="+$scope.phonenumber)
            	.success(
							function(response) {
								$scope.regnores = response.data;
								alert($scope.regnores);
					          	// window.location = "index.html";
							});
        		  //alert('Contact Updated');
            	 //window.location = "index.html";
            	 
                }
            $scope.listUser();
            	//document.getElementById("btnlist").click();
            	
         
            $scope.id =null;
            $scope.firstname='';
            $scope.lastname='';
            $scope.email='';
            $scope.phonenumber='';
            }
       
       
        
        
        
   // };
});
