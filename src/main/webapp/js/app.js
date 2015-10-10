/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

angular.module('aplicacion',[])
//scope le pide al navegador al html y http le manda al servidor 
        .controller("ctrlPrincipal", function ($scope, $http){
            console.log('Binvenido a angularJS!!!');
      $scope.mensajito='este es un mensajito simple';  
});

