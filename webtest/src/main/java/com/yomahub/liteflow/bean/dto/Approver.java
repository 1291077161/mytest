// package com.yomahub.liteflow.bean.dto;
//
// import lombok.Data;
//
//
// /**
//  * 抽象的审批人接口
//  * @author Joy
//  * @date 2023/12/19
//  * @param
//  *
//  */
//
// public interface Approver {
//
//     /**
//      * 设置下一个审批人的方法
//      * @param nextApprover
//      */
//     void setNextApprover(Approver nextApprover);
//
//     /**
//      * 处理请假申请
//      * @param request
//      */
//     void processRequest(LeaveRequest request);
// }
//
//
// /**
//  * 创建请假申请对象
//  * @author Joy
//  * @date 2023/12/19
//  * @param
//  *
//  */
//
// @Data
// public class LeaveRequest {
//     /**
//      * 姓名
//      */
//     private String employeeName;
//     /**
//      * 天数
//      */
//     private int leaveDays;
//     /**
//      * 理由
//      */
//     private String reason;
//
//     public LeaveRequest(String employeeName, int leaveDays, String reason) {
//         this.employeeName = employeeName;
//         this.leaveDays = leaveDays;
//         this.reason = reason;
//     }
// }
//
//
// /**
//  * 具体的审批级别创建类
//  * @author Joy
//  * @date 2023/12/19
//  * @param
//  *
//  */
//
// public class TeamLeader implements Approver{
//
//     private Approver nextApprover;
//
//
//     @Override
//     public void setNextApprover(Approver nextApprover) {
//         this.nextApprover = nextApprover;
//     }
//
//     @Override
//     public void processRequest(LeaveRequest request) {
//         if (request.getLeaveDays() <= 3) {
//             System.out.println("Team leader approved the leave request.");
//         } else {
//             if (nextApprover != null) {
//                 System.out.println("Team leader forwarded the leave request to department manager.");
//                 nextApprover.processRequest(request);
//             } else {
//                 System.out.println("No approver available for this request.");
//             }
//         }
//     }
// }
//
//
// public class DepartmentManager implements Approver{
//     private Approver nextApprover;
//
//     @Override
//     public void setNextApprover(Approver nextApprover) {
//         this.nextApprover = nextApprover;
//     }
//
//     @Override
//     public void processRequest(LeaveRequest request) {
//         if (request.getLeaveDays() <= 7) {
//             System.out.println("Department manager approved the leave request.");
//         } else {
//             if (nextApprover != null) {
//                 System.out.println("Department manager forwarded the leave request to general manager.");
//                 nextApprover.processRequest(request);
//             } else {
//                 System.out.println("No approver available for this request.");
//             }
//         }
//     }
// }
//
//
// public class GeneralManager implements Approver{
//
//     /**
//      * gengrealManager是责任链的最后一个审批人，所以不需要下一个审批人
//      * @param nextApprover
//      */
//     @Override
//     public void setNextApprover(Approver nextApprover) {
//         // General manager is the last approver in the chain, so this method can be left empty
//     }
//
//     @Override
//     public void processRequest(LeaveRequest request) {
//         if (request.getLeaveDays() <= 14) {
//             System.out.println("General manager approved the leave request.");
//         } else {
//             System.out.println("General manager rejected the leave request.");
//         }
//     }
// }
//
//
// public class Client {
//
//     public static void main(String[] args) {
//
//         //创建请假申请对象
//         LeaveRequest request = new LeaveRequest("employee zhansan", 5, "世界那么大，我想去看看");
//         //创建具体的审批人对象
//         TeamLeader teamLeader = new TeamLeader();
//         DepartmentManager departmentManager = new DepartmentManager();
//         GeneralManager generalManager = new GeneralManager();
//         //构建责任链
//         teamLeader.setNextApprover(departmentManager);
//         departmentManager.setNextApprover(generalManager);
//         //提交请假申请
//         teamLeader.processRequest(request);
//     }
// }


