//유효성 검사
const check = () => {
  let data = true;
  const ownerTel = document.querySelector('input[name="ownerTel"]').value;

  //필수입력
  const ownerName = document.querySelector('input[name="ownerName"]').value;
  const color = document.querySelector('select[name="color"]').value;
  const modelNum = document.querySelector('select[name="modelNum"]').value;
  if(ownerName === '' || color === '' || modelNum === ''){
    document.querySelector('#tel-p').textContent ='구매자명, 색상, 모델은 필수입력입니다.';
    data = false;
  }
  //else면 폰 번호 전달

  if(ownerTel !== ''){
    const tel = checkTel(ownerTel);
    if(!tel){
      data = false;
    }
  }
  
  return data;
}

//유효성 검사(연락처)
const checkTel = (ownerTel) => {
  //정규식
  const phoneRegex = /^010-\d{4}-\d{4}$/;

  if(!phoneRegex.test(ownerTel)){
    document.querySelector('#tel-p').textContent = '010-1111-2222형태로 입력해야합니다.';
    return false;
  }
  return true;
}


//등록버튼 클릭 시 실행 함수
const regSales = () => {
  const result = check();

  if(result){
    document.querySelector('#regSales').submit();
  }

}