//유효성 검사
const chetTel = () => {
  let data = true;
  const ownerTel = document.querySelector('input[name="ownerTel"]').value;

  //정규식
  const phoneRegex = /^010-\d{4}-\d{4}$/;

  if(!phoneRegex.test(ownerTel)){
    document.querySelector('#tel-p').textContent = '010-1111-2222형태로 입력해야합니다.'
    data = false;
  }

  return data;
}

//등록버튼 클릭 시 실행 함수
const regSales = () => {
  const result = chetTel();

  if(result){
    document.querySelector('#regSales').submit();
  }

}