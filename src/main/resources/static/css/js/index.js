angular.module("myapp", ["ngRoute"]).controller("indexcon", function ($scope, $http, $interval) {
    $http({
        method: 'GET',
        url: '/index'
    }).then(function successCallback(response) {
        /* console.log('get Oplog success:', response);*/
        $scope.blog = response.data.blogs;
        $scope.ann = response.data.announcement;
        /*alert(response.data.test1);*/
        //alert(response.data.pages);
        $scope.maxSize = Math.ceil(response.data.pages);
        //alert($scope.maxSize);
    }, function errorCallback(response) {
        alert("后台出错啦");
    });
    $scope.pageNum = 1;
    $scope.page = function (pagenum) {
        // alert("11");
        $http({
            method: 'GET',
            url: '/index?pageNum=' + pagenum,
        }).then(function successCallback(response) {
            $scope.blog = response.data.blogs;
        }, function errorCallback(response) {
            alert("后台出错啦");
        });
    };
    $scope.page1 = function () {
        // alert("1");
        if ($scope.pageNum > 1) {
            $scope.pageNum = $scope.pageNum - 1;
            $scope.page($scope.pageNum);
        }
    };
    $scope.page2 = function () {
        if ($scope.pageNum < $scope.maxSize) {
            $scope.pageNum = $scope.pageNum + 1;
            //alert("2");
            $scope.page($scope.pageNum);
        }

    };
    $scope.gonggao = function (context) {
        $scope.AnnContext = context;
        // alert($scope.AnnContext);
    };
    $scope.gbzhuce=function () {
        $("#rigister").modal('toggle');
    }
    $scope.gbdelu=function () {
        $("#login").modal('toggle');
    }

    $("input[name='username']").blur(function () {
        $http({
            method: 'GET',
            url: '/user/findUser/{'+Date.parse(new Date())+'}'+'?username='+$(this).val()
        }).then(function successCallback(response) {
            //alert("1");
            $scope.boole = response.data.isUser;
        }, function errorCallback(response) {
            alert("后台出错啦");
        });
    });
    $scope.submitForm = function () {
        //console.log($scope.userdata);
        if ($scope.signUpForm.$invalid|| $scope.boole) {
            alert("请检查你的信息");
        } else {
            var em=$("#exampleInputEmail1").val();
            var un=$("input[name='username']").val();
            var pd=$("input[name='password']").val();
            if (em != null & un != null
                & pd != null ) {
                if ($scope.yamstr == $("input[name='yzm']").val()) {
                    //alert("提交成功!");
                    $http({
                        method: 'GET',
                        url: '/user/rigister?username='+un+'&password=' + pd+'&email='+em
                    }).then(function successCallback(response) {
                        $scope.userInfo = response.data.user;
                        $scope.userinfo=true;
                        $scope.gbzhuce();
                    }, function errorCallback(response) {
                        alert("后台出错啦");
                    });
                } else {
                    alert("验证码输入不正确!");
                }
            } else {
                alert("请检查你的信息");
            }
        }
    };
    $http({
        method: 'GET',
        url: '/user/getUserCookie'
    }).then(function successCallback(response) {
        $scope.userinfo = response.data.userIn;
    }, function errorCallback(response) {
        alert("请检查你的信息");
    });
    $scope.loginForm1 = function () {
        if ($scope.loginForm.$invalid) {
            alert("请检查你的信息");
        } else {
           // alert("1");
            var un=$("input[name='uname']").val();
            var pd=$("input[name='pwd']").val();
            if (un != null
                & pd != null ) {
                    $http({
                        method: 'GET',
                        url: '/user/login?username='+un+'&password=' + pd
                    }).then(function successCallback(response) {
                        $scope.userInfo = response.data.user;
                        if($scope.userInfo==null){
                            alert("请检查你的信息");
                        }else {
                            $scope.userinfo=true;
                            $scope.gbdelu();
                        }

                    }, function errorCallback(response) {
                        alert("请检查你的信息");
                    });

            } else {
                alert("请检查你的信息");
            }
        }
    };
    $scope.vm={};
    var vm=$scope.vm;
    $scope.paracont = "获取验证码";
    vm.disabledClick = false;
    vm.sendMessage = function(){
        var second = 60,
            timePromise = $interval(function(){
                vm.disabledClick = true;
                if(second <= 0){
                    $interval.cancel(timePromise);
                    second = 60;
                }else{
                    second--;
                    if(second==58){
                        var em=$("#exampleInputEmail1").val();
                        $http({
                            method: 'GET',
                            url: '/yzm/{'+Date.parse(new Date())+'}'+'?email='+ em
                        }).then(function successCallback(response) {
                            $scope.yamstr = response.data.yzm;
                        }, function errorCallback(response) {
                            alert("邮箱格式不正确");
                        });
                    }
                    $scope.paracont = second + "秒后可重发";
                    if(second == 0){
                        $scope.paracont = "重发验证码";
                        vm.disabledClick = false;
                    }
                }
            },1000,60);
    }



}) .config(function ($routeProvider) {
    $routeProvider.
    when('/', {
        templateUrl: 'in'
    }).
    when('/write', {
        templateUrl: 'write'
    }).
    otherwise({
        redirectTo : '/'
    });});
$(function () {
    $("#abc").popover();
    $("#gonggao").popover();
});
