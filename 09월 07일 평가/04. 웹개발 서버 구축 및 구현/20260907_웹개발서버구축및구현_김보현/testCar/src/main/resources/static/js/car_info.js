//유효성 검사
const check = () => {
  let data = true;
  const productCom = document.querySelector('select[name="productCom"]').value;
  const modelName = document.querySelector('input[name="modelName"]').value;
  const carPrice = document.querySelector('input[name="carPrice"]').value;

  if(productCom === '' || modelName === '' ||carPrice === ''){
      document.querySelector('#invaild-p').textContent = '입력정보가 올바르지 않습니다.'
      data = false;
  }
  return data;
}

//등록버튼 클릭 시 실행함수
const regCar = () => {
  const data = check();
    //제조사, 모델명, 가격은필수입력
    if(data){
      document.querySelector('#reg-car').submit();
    }
}

