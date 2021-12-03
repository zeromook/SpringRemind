$(function(){


   // 1) '댓글 버튼' 눌렀을때 : 댓글 입력할때,
   //1. 댓글 입력
	$('#replyConfirm').click(function(){
	
		let param = $("#replyForm").serialize()//자기가 알아서 네임 밸류 식으로 분리해줌
		
		$.ajax({ 
			type : 'get',
			data : param,//데이터를 보낼때 쓰는것
			url : '../replies/new',
			success : function(result){
				alert(result);
				$("#reply").val("");//입력이 완료되면 공백처리
				replyList();
			},
			error : function(err){
				alert('fail');
			}
		}); // end of ajax
	}) // end of click
	
	replyList();
   //2) 댓글 목록 출력하기
   function replyList(){
      $.ajax({
         type: 'get',
         url:'../replies',
         dataType : 'json', //받는애의 데이터 타입.
         success : function(result){
            //console.log(result);
            //동적으로 목록 만들기
            var replyList = $('#replyList');
            replyList.empty();
            for(row of result){
               var tr = $('<tr/>')
               var rno = $('<td/>').html(row['rno'])
               tr.append(rno)
               
               //작성자와 댓글 추가로 출력
               var replyer = $("<td/>").html(row['replyer'])
               tr.append(replyer)

               var reply = $("<td/>").html(row['reply'])
               tr.append(reply)
               
               //수정, 삭제
               tr.append('<td><button class="modify">수정</button></td>');
               tr.append('<td><button class="delete">삭제</button></td>');
               
               
               replyList.append(tr)
            }
         },
         error : function(err){
            alert('전송실패');
            console.log(err);
         }
      });//end of ajax
   
   } //end of
   
   
   // 3. 수정부분....
   let isEditing = 0;
   $(document).on("click",".modify",function(){
      //수정다하고나서
      if(isEditing==1){
         if($(this).text()==="확인"){
            isEditing = 0;
            var rnotext = $(this).parent().parent().children("td:eq(0)").text()
            var text = $('#replys').val();
            $.ajax({
                 type: 'get',
                 url: '../replies/update',
                 data : {reply : text, rno : rnotext },
                 //한글처리
                 contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
                 
                 success : function(result){
                    replyList();
                 },
                 error : function(err){
                    alert('fail');
                 }
              });
           }
      }
      //수정하기전에..
      else{
         isEditing = 1;
         let thistd = $(this).parent().prev();
         let text = $(this).parent().prev().text();
         thistd.val('');
         thistd.html("<input type='text' name='reply' id='replys'>");
         $(this).text('확인')
      }
      
      
   })
   
   //4. 삭제부분
   $(document).on("click",".delete",function(){
      replyList();
      console.log("hello~~~")
      console.log($(this).parent().parent().children("td:eq(0)").text())
      var rno2 = $(this).parent().parent().children("td:eq(0)").text();
      let param = $("#replyForm").serialize()
      $.ajax({
            type : "get",
            url : "../replies/" + rno2,
            data : param,
            success : function(result){
               alert(result)
            },//end of success
            error : function(err){
               alert("에러발생!!")
            }//end of error
         })//end of ajax
         replyList();
   })
   


});